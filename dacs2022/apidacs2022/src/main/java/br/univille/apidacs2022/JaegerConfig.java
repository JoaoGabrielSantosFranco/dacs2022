package br.univille.apidacs2022;

import org.springframework.context.annotation.Bean;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.RateLimitingSampler;
import io.jaegertracing.Configuration.SamplerConfiguration;
import io.jaegertracing.Configuration.SenderConfiguration;
import io.jaegertracing.Configuration.ReporterConfiguration;

public class JaegerConfig {
    @Bean
    public JaegerTracer jaegerTracer() {
        // ATEÇÃO: fazer em produção
        // var samper = new
        // SamplerConfiguration().withType(ConstSampler.TYPE).withParam(1);

        var samper = new SamplerConfiguration()
        .withType(RateLimitingSampler.TYPE).withParam(10);

        var reporter = new ReporterConfiguration().withLogSpans(true).withSender(
                new SenderConfiguration().withAgentHost("172.18.0.35"));

        return new io.jaegertracing.Configuration("dacsapi-JFranco").withSampler(samper).withReporter(reporter)
                .getTracer();
    }
}
