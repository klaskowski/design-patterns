package designpatterns.exercises.builder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserBuilderTest {

    UserBuilder userBuilder;

    @Before
    public void setUp() {
        userBuilder = new UserBuilder("John", "Lock");
    }

    @Test
    public void testMinimalUserCreated(){
        User minimalUser = userBuilder.build();
        assertEquals("John", minimalUser.getFirstName());
        assertEquals("Lock", minimalUser.getLastName());
    }

    @Test
    public void testFullUserCreated(){
        userBuilder.setAddress("Long Island 42");
        userBuilder.setAge(56);
        userBuilder.setPhone("+1489578123");
        User fullUser = userBuilder.build();
        assertEquals("John", fullUser.getFirstName());
        assertEquals("Lock", fullUser.getLastName());
        assertEquals("Long Island 42", fullUser.getAddress());
        assertEquals(56, fullUser.getAge());
        assertEquals("+1489578123", fullUser.getPhone());
    }

    @Test
    public void testUserWithSomeOptionalFieldsCreated(){
        userBuilder.setPhone("+1489578123");
        User user = userBuilder.build();
        assertEquals("John", user.getFirstName());
        assertEquals("Lock", user.getLastName());
        assertEquals("+1489578123", user.getPhone());
    }

}