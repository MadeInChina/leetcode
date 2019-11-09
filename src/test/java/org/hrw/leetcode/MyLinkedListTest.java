package org.hrw.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedListTest {

  MyLinkedList myLinkedList;

  @Test
  public void should_return_correct_length() {
    myLinkedList = new MyLinkedList();
    assertEquals(0, myLinkedList.getLength());
    myLinkedList.addAtHead(0);
    assertEquals(1, myLinkedList.getLength());

    myLinkedList.addAtHead(1);

    assertEquals(2, myLinkedList.getLength());

    myLinkedList.addAtHead(2);

    assertEquals(3, myLinkedList.getLength());
  }

  @Test
  public void should_return_negative_1_when_index_invalid() {
    myLinkedList = new MyLinkedList();
    assertEquals(-1, myLinkedList.get(-1));
    assertEquals(-1, myLinkedList.get(0));
    myLinkedList.addAtHead(1);
    assertEquals(1, myLinkedList.get(0));
    
  }
}
