package aboutHttpClientSomething;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Version
 * @Date 7/27/2020
 * @Author Gon
 */
public class HttpClientDemo
{
    public static void main(String[] args)
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        List<NameValuePair> formparams = new ArrayList<NameValuePair>();

        //for (Map.Entry<String, String> entry : map.entrySet()) {
            //给参数赋值
            formparams.add(new BasicNameValuePair("tokenID", "1df5a9d3c72097447a2970efcd958c06"));
            formparams.add(new BasicNameValuePair("limit", "10"));
            formparams.add(new BasicNameValuePair("offset", "90"));
            formparams.add(new BasicNameValuePair("stat", ""));
            formparams.add(new BasicNameValuePair("userName", ""));
            formparams.add(new BasicNameValuePair("flowName", ""));
            formparams.add(new BasicNameValuePair("approveStatus", ""));
            formparams.add(new BasicNameValuePair("serviceName", ""));
            formparams.add(new BasicNameValuePair("countNo", ""));
            formparams.add(new BasicNameValuePair("dbContent", ""));
            formparams.add(new BasicNameValuePair("bigDataFlag", ""));
        //}

        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);

        HttpPost httppost = new HttpPost("http://192.168.1.235:8081/autoMaticEngineBoot-1.0.0/serviceByDynamicFlow/getAllSaveModuleEngineFlowDescInfo.do");

        httppost.setEntity(entity);

        CloseableHttpResponse response = null;

        try {
            //3.执行get请求并返回结果
            response = httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpEntity entity2 = response.getEntity();
        String result = null;
        try {
            result = EntityUtils.toString(entity2);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
