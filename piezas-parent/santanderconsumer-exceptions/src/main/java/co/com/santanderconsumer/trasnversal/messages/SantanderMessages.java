/**
 * 
 */
package co.com.santanderconsumer.trasnversal.messages;

/**
 * @author l.ruizs
 *
 */
public interface SantanderMessages {

	public String getMessageByKey(String key);
	
	public String getMessageByKey(MessagesEnum key);
	
	public String getMessageByKey(String key, String... params);

}
