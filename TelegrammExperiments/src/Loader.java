import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthCheckedPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 521068, "ae8674b3b9c4d7974771cdf80c1e95fa");
        System.out.println("Please, type telephone number");
        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(reader.readLine().trim());
        System.out.println(checkedPhone.isRegistered());
    }
}
