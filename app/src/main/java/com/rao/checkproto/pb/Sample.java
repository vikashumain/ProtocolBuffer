// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: Sample.proto at 7:1
package com.rao.checkproto.pb;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Sample extends Message<Sample, Sample.Builder> {
  public static final ProtoAdapter<Sample> ADAPTER = new ProtoAdapter_Sample();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_X = 0;

  public static final Integer DEFAULT_Y = 0;

  public static final String DEFAULT_NAME = "";

  public static final Integer DEFAULT_ID = 0;

  public static final String DEFAULT_URL = "";

  public static final String DEFAULT_DESCRIPTION = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer x;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32"
  )
  public final Integer y;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED
  )
  public final String name;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
  )
  public final Integer id;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String url;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String description;

  public Sample(Integer x, Integer y, String name, Integer id, String url, String description) {
    this(x, y, name, id, url, description, ByteString.EMPTY);
  }

  public Sample(Integer x, Integer y, String name, Integer id, String url, String description, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.x = x;
    this.y = y;
    this.name = name;
    this.id = id;
    this.url = url;
    this.description = description;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.x = x;
    builder.y = y;
    builder.name = name;
    builder.id = id;
    builder.url = url;
    builder.description = description;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Sample)) return false;
    Sample o = (Sample) other;
    return Internal.equals(unknownFields(), o.unknownFields())
        && Internal.equals(x, o.x)
        && Internal.equals(y, o.y)
        && Internal.equals(name, o.name)
        && Internal.equals(id, o.id)
        && Internal.equals(url, o.url)
        && Internal.equals(description, o.description);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (x != null ? x.hashCode() : 0);
      result = result * 37 + (y != null ? y.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (description != null ? description.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (x != null) builder.append(", x=").append(x);
    if (y != null) builder.append(", y=").append(y);
    if (name != null) builder.append(", name=").append(name);
    if (id != null) builder.append(", id=").append(id);
    if (url != null) builder.append(", url=").append(url);
    if (description != null) builder.append(", description=").append(description);
    return builder.replace(0, 2, "Sample{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Sample, Builder> {
    public Integer x;

    public Integer y;

    public String name;

    public Integer id;

    public String url;

    public String description;

    public Builder() {
    }

    public Builder x(Integer x) {
      this.x = x;
      return this;
    }

    public Builder y(Integer y) {
      this.y = y;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    @Override
    public Sample build() {
      if (name == null
          || id == null) {
        throw Internal.missingRequiredFields(name, "name",
            id, "id");
      }
      return new Sample(x, y, name, id, url, description, buildUnknownFields());
    }
  }

  public enum PhoneType implements WireEnum {
    MOBILE(0),

    HOME(1),

    WORK(2);

    public static final ProtoAdapter<PhoneType> ADAPTER = ProtoAdapter.newEnumAdapter(PhoneType.class);

    private final int value;

    PhoneType(int value) {
      this.value = value;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static PhoneType fromValue(int value) {
      switch (value) {
        case 0: return MOBILE;
        case 1: return HOME;
        case 2: return WORK;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  private static final class ProtoAdapter_Sample extends ProtoAdapter<Sample> {
    ProtoAdapter_Sample() {
      super(FieldEncoding.LENGTH_DELIMITED, Sample.class);
    }

    @Override
    public int encodedSize(Sample value) {
      return (value.x != null ? ProtoAdapter.UINT32.encodedSizeWithTag(1, value.x) : 0)
          + (value.y != null ? ProtoAdapter.UINT32.encodedSizeWithTag(2, value.y) : 0)
          + ProtoAdapter.STRING.encodedSizeWithTag(3, value.name)
          + ProtoAdapter.INT32.encodedSizeWithTag(4, value.id)
          + (value.url != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, value.url) : 0)
          + (value.description != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, value.description) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Sample value) throws IOException {
      if (value.x != null) ProtoAdapter.UINT32.encodeWithTag(writer, 1, value.x);
      if (value.y != null) ProtoAdapter.UINT32.encodeWithTag(writer, 2, value.y);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.name);
      ProtoAdapter.INT32.encodeWithTag(writer, 4, value.id);
      if (value.url != null) ProtoAdapter.STRING.encodeWithTag(writer, 5, value.url);
      if (value.description != null) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.description);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Sample decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.x(ProtoAdapter.UINT32.decode(reader)); break;
          case 2: builder.y(ProtoAdapter.UINT32.decode(reader)); break;
          case 3: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.id(ProtoAdapter.INT32.decode(reader)); break;
          case 5: builder.url(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.description(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public Sample redact(Sample value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
