/**
 * 
 */
package co.com.santanderconsumer.trasnversal.messages.impl;

import java.text.MessageFormat;

import javax.annotation.Resource;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import co.com.santanderconsumer.trasnversal.messages.MessagesEnum;
import co.com.santanderconsumer.trasnversal.messages.SantanderMessages;

/**
 * Clase que permite leer el archivo de messages.properties.
 * 
 * @author l.ruizs
 *
 */
@Service
@PropertySource("classpath:messages.properties")
public class SantanderMessagesImpl implements SantanderMessages {

	@Resource
	private Environment env;

	public SantanderMessagesImpl() {

	}
	
	/**
	 * Metodo para obtener un valor del properties a traves de su key
	 * 
	 * @param key
	 * @return
	 */
	@Override
	public String getMessageByKey(String key) {
		return env.getProperty(key);
	}
	
	/**
	 * Metodo para obtener un valor del properties a traves de su key por enumxxxxxxx
	 * @param key
	 * @return
	 */
	@Override
	public String getMessageByKey(MessagesEnum key) {
		return env.getProperty(key.toString());
	}
	
	/**
	 * 
	 * @param key
	 * @param params
	 * @return
	 */
	@Override
	public String getMessageByKey(String key, String... params) {
		return MessageFormat.format(env.getProperty(key), params);
	}
}
