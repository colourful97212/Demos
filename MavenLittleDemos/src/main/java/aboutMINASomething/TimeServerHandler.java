package aboutMINASomething;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import java.util.Date;

/**
 * @Description
 * @Version
 * @Date 9/3/2020
 * @Author Gon
 */
public class TimeServerHandler extends IoHandlerAdapter
{
    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception
    {
        cause.printStackTrace();
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws  Exception
    {
        String str = message.toString();
        if( str.trim().equalsIgnoreCase("quit") ) {
            session.close();
            return;
        }
        Date date = new Date();
        session.write( date.toString() + "GGG");
        System.out.println("Message written...");
        System.out.println(message.toString());
    }

    @Override
    public void sessionIdle( IoSession session, IdleStatus status ) throws Exception
    {
        System.out.println( "IDLE " + session.getIdleCount( status ));
    }
}