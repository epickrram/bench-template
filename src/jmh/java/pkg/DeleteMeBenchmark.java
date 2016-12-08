package pkg;

import org.openjdk.jmh.annotations.Benchmark;

public class DeleteMeBenchmark
{
    @Benchmark
    public long baseline()
    {
        return 0L;
    }
}
