package com.example.demo.core.service;

import com.example.demo.db.service.EnvService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoService {

    private final EnvService envService;

    public String getRuntimeTimes() {
        log.info("获取运行环境信息: {}", envService.getEnv());
        // 使用纳秒取得时间 START
        long dbStartTime = System.nanoTime();
        // 使用纳秒取得时间 END
        long dbEndTime = System.nanoTime();
        long dbDurationNano = (dbEndTime - dbStartTime);
        String runtimeTimes = "程序执行时间：" + dbDurationNano + " 纳秒";
        log.info(runtimeTimes);
//        long dbDurationMillis = dbDurationNano / 1_000_000; // 将纳秒转换为毫秒
//        double dbSeconds = (double) dbDurationNano / 1_000_000_000.0;
//        runtimeTimes = "程序执行时间：" + dbDurationMillis + " 毫秒";
//        log.info(runtimeTimes);

        return runtimeTimes;
    }
}
