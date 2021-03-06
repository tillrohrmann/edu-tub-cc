package de.tuberlin.cit.cc.ex4.stratosphere.types;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import eu.stratosphere.pact.common.type.Value;

public class LineItemSummary implements Value {

  public int orderId;

  public int totalItemQuantity;

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeInt(orderId);
    out.writeInt(totalItemQuantity);
  }

  @Override
  public void read(DataInput in) throws IOException {
    orderId = in.readInt();
    totalItemQuantity = in.readInt();
  }
}
