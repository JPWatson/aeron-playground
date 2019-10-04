package com.weareadaptive.hydra.training.aeron;

import org.agrona.concurrent.ShutdownSignalBarrier;

public class BasicSubscriber {
  public static void main(String[] args) {
    System.out.println("Started Subscriber");

    // TODO

    new ShutdownSignalBarrier().await();
  }
}
