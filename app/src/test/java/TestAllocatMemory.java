import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestAllocatMemory {
    public static void main(String[] args) {
        allocateMemory();

        try {
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void allocateMemory() {
        List<byte[]> list = new ArrayList<>();
        int size = 1024 * 1024 * 400;
        int len = size / (20 * 1024);
        for (int i = 0; i < len; i++) {
            byte[] bytes = new byte[20 * 1024];
            list.add(bytes);
        }

    }
}
