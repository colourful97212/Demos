package aboutMINASomething;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @Description
 * @Version
 * @Date 9/1/2020
 * @Author Gon
 */
public class MinaTimeServer
{
    public static void main(String[] args) throws IOException
    {
        IoAcceptor acceptor = new NioSocketAcceptor();
        acceptor.bind(new InetSocketAddress(8801));
    }
}
