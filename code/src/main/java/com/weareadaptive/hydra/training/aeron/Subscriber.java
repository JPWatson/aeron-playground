package com.weareadaptive.hydra.training.aeron;

import org.agrona.concurrent.ShutdownSignalBarrier;

public class Subscriber {
  public static void main(String[] args) {
    final String channel = System.getProperty("channel", "aeron:udp?endpoint=localhost:9000");

    System.out.println("Started Subscriber on " + channel);


    // TODO

    new ShutdownSignalBarrier().await();
  }
}
