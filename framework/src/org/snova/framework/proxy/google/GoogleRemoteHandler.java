/**
 * 
 */
package org.snova.framework.proxy.google;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.handler.codec.http.HttpChunk;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.snova.framework.proxy.LocalProxyHandler;
import org.snova.framework.proxy.RemoteProxyHandler;

/**
 * @author wqy
 * 
 */
public class GoogleRemoteHandler implements RemoteProxyHandler
{

	@Override
	public void handleRequest(LocalProxyHandler local, HttpRequest req)
	{

	}

	@Override
	public void handleChunk(LocalProxyHandler local, HttpChunk chunk)
	{
	}

	@Override
	public void handleRawData(LocalProxyHandler local, ChannelBuffer raw)
	{
	}

	@Override
	public void close()
	{
	}

}
