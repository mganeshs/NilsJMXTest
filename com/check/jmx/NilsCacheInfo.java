package com.check.jmx;

public class NilsCacheInfo implements NilsCacheInfoMBean {
	private long g1CodeCacheEntries = 0l;
	private long g2CodeCacheEntries = 0l;
	

	public void incrementCounter() {
		g1CodeCacheEntries++;
		g2CodeCacheEntries++;
	}
	public long getG1CodeCacheEntries() {
		return g1CodeCacheEntries;
		
	}
	public long getG2CodeCacheEntries() {
		return g2CodeCacheEntries;
	}
}