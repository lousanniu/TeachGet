package com.springCloud.provider.util;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 娜苏苏
 * @create 2019/8/21
 */
public final class ProviderThreadPoolUtil {
    public ProviderThreadPoolUtil() {
    }

    public static ExecutorService newExecutor(int threadSize) {
        return new ThreadPoolExecutor(threadSize, threadSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newExecutor() {
        return new ThreadPoolExecutor(0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newSingleExecutor() {
        return Executors.newSingleThreadExecutor();
    }

    public static ThreadPoolExecutor newExecutor(int corePoolSize, int maximumPoolSize) {
        return new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static ThreadPoolExecutor newExecutorByBlockingCoefficient(float blockingCoefficient) {
        if (blockingCoefficient < 1.0F && blockingCoefficient >= 0.0F) {
            int poolSize = (int)((float)Runtime.getRuntime().availableProcessors() / (1.0F - blockingCoefficient));
            return new ThreadPoolExecutor(poolSize, poolSize, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        } else {
            throw new IllegalArgumentException("[blockingCoefficient] must between 0 and 1, or equals 0.");
        }
    }

    public static void execute(Runnable runnable) {
        GlobalThreadPool.execute(runnable);
    }

    public static Runnable excAsync(final Runnable runnable, boolean isDeamon) {
        Thread thread = new Thread() {
            public void run() {
                runnable.run();
            }
        };
        thread.setDaemon(isDeamon);
        thread.start();
        return runnable;
    }

    public static <T> Future<T> execAsync(Callable<T> task) {
        return GlobalThreadPool.submit(task);
    }

    public static Future<?> execAsync(Runnable runnable) {
        return GlobalThreadPool.submit(runnable);
    }

    public static <T> CompletionService<T> newCompletionService() {
        return new ExecutorCompletionService(GlobalThreadPool.getExecutor());
    }

    public static <T> CompletionService<T> newCompletionService(ExecutorService executor) {
        return new ExecutorCompletionService(executor);
    }

    public static CountDownLatch newCountDownLatch(int threadCount) {
        return new CountDownLatch(threadCount);
    }

    public static Thread newThread(Runnable runnable, String name) {
        Thread t = new Thread(currentThreadGroup(), runnable, name);
        if (t.isDaemon()) {
            t.setDaemon(false);
        }

        if (t.getPriority() != 5) {
            t.setPriority(5);
        }

        return t;
    }

    public static boolean sleep(Number timeout, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(timeout.longValue());
            return true;
        } catch (InterruptedException var3) {
            return false;
        }
    }

    public static boolean sleep(Number millis) {
        if (millis == null) {
            return true;
        } else {
            try {
                Thread.sleep(millis.longValue());
                return true;
            } catch (InterruptedException var2) {
                return false;
            }
        }
    }

    public static boolean safeSleep(Number millis) {
        long millisLong = millis.longValue();

        long before;
        long after;
        for(long done = 0L; done < millisLong; done += after - before) {
            before = System.currentTimeMillis();
            if (!sleep(millisLong - done)) {
                return false;
            }

            after = System.currentTimeMillis();
        }

        return true;
    }

    public static StackTraceElement[] getStackTrace() {
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement getStackTraceElement(int i) {
        StackTraceElement[] stackTrace = getStackTrace();
        if (i < 0) {
            i += stackTrace.length;
        }

        return stackTrace[i];
    }

    public static <T> ThreadLocal<T> createThreadLocal(boolean isInheritable) {
        return (ThreadLocal)(isInheritable ? new InheritableThreadLocal() : new ThreadLocal());
    }

    public static void interupt(Thread thread, boolean isJoin) {
        if (null != thread && !thread.isInterrupted()) {
            thread.interrupt();
            if (isJoin) {
                waitForDie(thread);
            }
        }

    }

    public static void waitForDie(Thread thread) {
        boolean dead = false;

        do {
            try {
                thread.join();
                dead = true;
            } catch (InterruptedException var3) {
            }
        } while(!dead);

    }

    public static Thread[] getThreads() {
        return getThreads(Thread.currentThread().getThreadGroup().getParent());
    }

    public static Thread[] getThreads(ThreadGroup group) {
        Thread[] slackList = new Thread[group.activeCount() * 2];
        int actualSize = group.enumerate(slackList);
        Thread[] result = new Thread[actualSize];
        System.arraycopy(slackList, 0, result, 0, actualSize);
        return result;
    }

    public static Thread getMainThread() {
        Thread[] var0 = getThreads();
        int var1 = var0.length;

        for(int var2 = 0; var2 < var1; ++var2) {
            Thread thread = var0[var2];
            if (thread.getId() == 1L) {
                return thread;
            }
        }

        return null;
    }

    public static ThreadGroup currentThreadGroup() {
        SecurityManager s = System.getSecurityManager();
        return null != s ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

}