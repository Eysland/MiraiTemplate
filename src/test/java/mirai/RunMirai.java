package mirai;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.utils.BotConfiguration;

public class RunMirai {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(123456, "password");
        bot.login();
    }
}

class WithConfiguration1 {
    public static void main(String[] args) {
        // 使用自定义配置
        Bot bot = BotFactory.INSTANCE.newBot(123456, "password", new BotConfiguration() {{
            fileBasedDeviceInfo(); // 使用 device.json 存储设备信息
//            setProtocol(MiraiProtocol.ANDROID_PAD); // 切换协议
        }});
        bot.login();
    }
}