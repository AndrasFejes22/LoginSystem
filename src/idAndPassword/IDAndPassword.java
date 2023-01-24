package idAndPassword;

import java.util.HashMap;

public class IDAndPassword {

    // create HashMap:

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    public IDAndPassword() {

        loginInfo.put("Bro", "IOu67");
        loginInfo.put("JohnDoe", "tz&gh");
        loginInfo.put("JaneDoe", "CVB456");
        loginInfo.put("Pista", "1234");

    }

    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(HashMap<String, String> loginInfo) {
        this.loginInfo = loginInfo;
    }
}
