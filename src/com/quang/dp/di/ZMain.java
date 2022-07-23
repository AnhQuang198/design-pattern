package com.quang.dp.di;

public class ZMain {
  public static void main(String[] args) {
    System.out.println("Hello Dependecy Injection!!");
    UserController userController = new UserController(new SmsService());
    userController.send("Hello Quang!!!");
  }

  public static class UserController {
    private MessageService messageService;

    public UserController(MessageService messageService) {
      this.messageService = messageService;
    }

    public void send(String msg) {
      messageService.sendMessage(msg);
    }
  }
}
