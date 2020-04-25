package com.springCloud.provider.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class GlobalThreadPool {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalThreadPool.class);
    private static ExecutorService executor;

    private GlobalThreadPool() {
    }

    public static synchronized void init() {
        if (null != executor) {
            executor.shutdownNow();
        }

        executor = new ThreadPoolExecutor(10, 100, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100));
        LOGGER.info("全局公共线程池初始化 ({},{},{},{},{})", new Object[]{0, 100, 60, "TimeUnit.SECONDS", "SynchronousQueue"});
    }

    public static synchronized void shutdown(boolean isNow) {
        if (null != executor) {
            if (isNow) {
                executor.shutdownNow();
            } else {
                executor.shutdown();
            }
        }

    }

    public static ExecutorService getExecutor() {
        return executor;
    }

    public static void execute(Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Exception var2) {
            //throw new TennisToolException("Exception when running task!", var2);
            throw new RuntimeException("Exception when running task!", var2);

        }
    }

    public static <T> Future<T> submit(Callable<T> task) {
        return executor.submit(task);
    }

    public static Future<?> submit(Runnable runnable) {
        return executor.submit(runnable);
    }

    static {
        init();
    }

}