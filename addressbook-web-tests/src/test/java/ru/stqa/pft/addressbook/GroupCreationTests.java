package ru.stqa.pft.addressbook;

import org.testng.annotations.*;



public class GroupCreationTests extends TestBase{

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    fillGroupForm(new GroupData("123", "456", "789"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
