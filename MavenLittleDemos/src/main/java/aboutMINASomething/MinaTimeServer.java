package aboutMINASomething;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

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
        //socket接收器
        IoAcceptor acceptor = new NioSocketAcceptor();
        //添加日志记录
        acceptor.getFilterChain().addLast("logger", new LoggingFilter());
        //添加编码解码器
        acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(
                new TextLineCodecFactory(Charset.forName("UTF-8"))
        ));
        //添加处理器(用于接收数据后处理处理数据逻辑)
        acceptor.setHandler(new TimeServerHandler());
        //设置读取数据缓存单位byte
        acceptor.getSessionConfig().setReadBufferSize( 2048 );
        //设置多长时间后接收器开始空闲
        acceptor.getSessionConfig().setIdleTime( IdleStatus.BOTH_IDLE, 10 );
        //绑定某个端口，作为数据入口
        acceptor.bind(new InetSocketAddress(8801));

    }
}
