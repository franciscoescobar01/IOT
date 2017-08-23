import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class PahoDemo {

    public static void main(String[] args) throws MqttException {

        System.out.println("== Suscripción ==");

        MqttClient client=new MqttClient("tcp://ipame.cl:1883", MqttClient.generateClientId());
        client.setCallback( new SimpleMqttCallBack() );
        client.connect();

        client.subscribe("owntracks");

    }

}