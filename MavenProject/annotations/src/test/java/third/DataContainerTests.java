package third;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DataContainerTests {
    @Test
    public void DataContainerTest() {
        DataContainer dataContainer = new DataContainer();
        dataContainer.setId(1);
        dataContainer.setName("Pavel");
        dataContainer.setOnDuty(true);
        Assertions.assertThat(dataContainer.getId()).isEqualTo(1);
        Assertions.assertThat(dataContainer.getName()).isEqualTo("Pavel");
        Assertions.assertThat(dataContainer.isOnDuty()).isEqualTo(true);

        DataContainer dataContainer1 = new DataContainer(2, "Tom", false);
        Assertions.assertThat(dataContainer1.getId()).isEqualTo(2);
        Assertions.assertThat(dataContainer1.getName()).isEqualTo("Tom");
        Assertions.assertThat(dataContainer1.isOnDuty()).isEqualTo(false);
    }
}
