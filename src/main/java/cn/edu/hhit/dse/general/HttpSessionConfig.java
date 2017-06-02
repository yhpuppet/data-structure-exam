package cn.edu.hhit.dse.general;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Vincent Yang on 2017/6/2.
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 5 * 30)
public class HttpSessionConfig {
}
