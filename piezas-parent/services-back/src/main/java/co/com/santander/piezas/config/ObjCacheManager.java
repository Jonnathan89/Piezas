package co.com.santander.piezas.config;

import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.PersistenceConfiguration;
import net.sf.ehcache.store.MemoryStoreEvictionPolicy;

public class ObjCacheManager {
	
	 private CacheManager manager;

	    private Cache objectCache;

	    public ObjCacheManager(){
	        manager = CacheManager.create();

	        objectCache =  manager.getCache("jsonDocCache");

	        if( objectCache == null){
	            objectCache = new Cache(
	                    new CacheConfiguration("jsonDocCache", 1000)
	                            .memoryStoreEvictionPolicy(MemoryStoreEvictionPolicy.LRU)
	                            .eternal(true)
	                            .timeToIdleSeconds(0)
	                            .diskExpiryThreadIntervalSeconds(0)
	                            .persistence(new PersistenceConfiguration().strategy(PersistenceConfiguration.Strategy.LOCALTEMPSWAP)));
	            objectCache.disableDynamicFeatures();
	            manager.addCache(objectCache);
	        }
	    }

	    @SuppressWarnings("unchecked")
		public List<Integer> getKeys() { return objectCache.getKeys();}

	    public void clearCache(){
	        manager.removeAllCaches();
	    }

	    public void putInCache(Integer key, Object value){
	        try{
	            objectCache.put(new Element(key, value));
	        }catch (CacheException e){
	            System.out.println(String.format( "Problem occurred while putting data into cache: %s", e.getMessage()));
	        }
	    }

	    public Object retrieveFromCache(Integer key){
	        try {
	            Element element = objectCache.get(key);
	            if(element != null)
	                return element.getObjectValue();
	        }catch (CacheException ce){
	            System.out.println(String.format("Problem occurred while trying to retrieveSpecific from cache: %s", ce.getMessage()));
	        }
	        return null;
	    }

}
