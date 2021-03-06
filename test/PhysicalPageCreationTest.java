import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Objects;

public class PhysicalPageCreationTest {

    private static OS os;
    private static List<PhysicalPage> physicalPages;

    @BeforeClass
    public static void createPhysicalPages(){
        os = new OS();
        physicalPages = os.getPhysicalPages();
    }

    @Test
    public void countAmountOfPhysicalPages(){
        assertTrue(OS.VARIABLES.PHYSICAL_PAGE_AMOUNT == os.getPhysicalPages().size());
    }

    @Test
    public void checkAddressesNotNull(){
        boolean hasEmptyAddress = physicalPages.stream()
                .anyMatch(Objects::isNull);

        assertTrue(!hasEmptyAddress);
    }

}
