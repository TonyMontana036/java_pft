package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.fillGroupForm(new GroupData("123", "456", "789"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
