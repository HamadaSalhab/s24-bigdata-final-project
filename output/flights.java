// ORM class for table 'flights'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 07 18:39:27 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class flights extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("legid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.legid = (String)value;
      }
    });
    setters.put("searchdate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.searchdate = (java.sql.Date)value;
      }
    });
    setters.put("flightdate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.flightdate = (java.sql.Date)value;
      }
    });
    setters.put("startingairport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.startingairport = (String)value;
      }
    });
    setters.put("destinationairport", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.destinationairport = (String)value;
      }
    });
    setters.put("farebasiscode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.farebasiscode = (String)value;
      }
    });
    setters.put("travelduration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.travelduration = (String)value;
      }
    });
    setters.put("elapseddays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.elapseddays = (Integer)value;
      }
    });
    setters.put("isbasiceconomy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.isbasiceconomy = (Boolean)value;
      }
    });
    setters.put("isrefundable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.isrefundable = (Boolean)value;
      }
    });
    setters.put("isnonstop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.isnonstop = (Boolean)value;
      }
    });
    setters.put("basefare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.basefare = (java.math.BigDecimal)value;
      }
    });
    setters.put("totalfare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.totalfare = (java.math.BigDecimal)value;
      }
    });
    setters.put("seatsremaining", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.seatsremaining = (Integer)value;
      }
    });
    setters.put("totaltraveldistance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.totaltraveldistance = (String)value;
      }
    });
    setters.put("segmentsdeparturetimeepochseconds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsdeparturetimeepochseconds = (String)value;
      }
    });
    setters.put("segmentsdeparturetimeraw", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsdeparturetimeraw = (String)value;
      }
    });
    setters.put("segmentsarrivaltimeepochseconds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsarrivaltimeepochseconds = (String)value;
      }
    });
    setters.put("segmentsarrivaltimeraw", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsarrivaltimeraw = (String)value;
      }
    });
    setters.put("segmentsarrivalairportcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsarrivalairportcode = (String)value;
      }
    });
    setters.put("segmentsdepartureairportcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsdepartureairportcode = (String)value;
      }
    });
    setters.put("segmentsairlinename", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsairlinename = (String)value;
      }
    });
    setters.put("segmentsairlinecode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsairlinecode = (String)value;
      }
    });
    setters.put("segmentsequipmentdescription", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsequipmentdescription = (String)value;
      }
    });
    setters.put("segmentsdurationinseconds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsdurationinseconds = (String)value;
      }
    });
    setters.put("segmentsdistance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentsdistance = (String)value;
      }
    });
    setters.put("segmentscabincode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        flights.this.segmentscabincode = (String)value;
      }
    });
  }
  public flights() {
    init0();
  }
  private String legid;
  public String get_legid() {
    return legid;
  }
  public void set_legid(String legid) {
    this.legid = legid;
  }
  public flights with_legid(String legid) {
    this.legid = legid;
    return this;
  }
  private java.sql.Date searchdate;
  public java.sql.Date get_searchdate() {
    return searchdate;
  }
  public void set_searchdate(java.sql.Date searchdate) {
    this.searchdate = searchdate;
  }
  public flights with_searchdate(java.sql.Date searchdate) {
    this.searchdate = searchdate;
    return this;
  }
  private java.sql.Date flightdate;
  public java.sql.Date get_flightdate() {
    return flightdate;
  }
  public void set_flightdate(java.sql.Date flightdate) {
    this.flightdate = flightdate;
  }
  public flights with_flightdate(java.sql.Date flightdate) {
    this.flightdate = flightdate;
    return this;
  }
  private String startingairport;
  public String get_startingairport() {
    return startingairport;
  }
  public void set_startingairport(String startingairport) {
    this.startingairport = startingairport;
  }
  public flights with_startingairport(String startingairport) {
    this.startingairport = startingairport;
    return this;
  }
  private String destinationairport;
  public String get_destinationairport() {
    return destinationairport;
  }
  public void set_destinationairport(String destinationairport) {
    this.destinationairport = destinationairport;
  }
  public flights with_destinationairport(String destinationairport) {
    this.destinationairport = destinationairport;
    return this;
  }
  private String farebasiscode;
  public String get_farebasiscode() {
    return farebasiscode;
  }
  public void set_farebasiscode(String farebasiscode) {
    this.farebasiscode = farebasiscode;
  }
  public flights with_farebasiscode(String farebasiscode) {
    this.farebasiscode = farebasiscode;
    return this;
  }
  private String travelduration;
  public String get_travelduration() {
    return travelduration;
  }
  public void set_travelduration(String travelduration) {
    this.travelduration = travelduration;
  }
  public flights with_travelduration(String travelduration) {
    this.travelduration = travelduration;
    return this;
  }
  private Integer elapseddays;
  public Integer get_elapseddays() {
    return elapseddays;
  }
  public void set_elapseddays(Integer elapseddays) {
    this.elapseddays = elapseddays;
  }
  public flights with_elapseddays(Integer elapseddays) {
    this.elapseddays = elapseddays;
    return this;
  }
  private Boolean isbasiceconomy;
  public Boolean get_isbasiceconomy() {
    return isbasiceconomy;
  }
  public void set_isbasiceconomy(Boolean isbasiceconomy) {
    this.isbasiceconomy = isbasiceconomy;
  }
  public flights with_isbasiceconomy(Boolean isbasiceconomy) {
    this.isbasiceconomy = isbasiceconomy;
    return this;
  }
  private Boolean isrefundable;
  public Boolean get_isrefundable() {
    return isrefundable;
  }
  public void set_isrefundable(Boolean isrefundable) {
    this.isrefundable = isrefundable;
  }
  public flights with_isrefundable(Boolean isrefundable) {
    this.isrefundable = isrefundable;
    return this;
  }
  private Boolean isnonstop;
  public Boolean get_isnonstop() {
    return isnonstop;
  }
  public void set_isnonstop(Boolean isnonstop) {
    this.isnonstop = isnonstop;
  }
  public flights with_isnonstop(Boolean isnonstop) {
    this.isnonstop = isnonstop;
    return this;
  }
  private java.math.BigDecimal basefare;
  public java.math.BigDecimal get_basefare() {
    return basefare;
  }
  public void set_basefare(java.math.BigDecimal basefare) {
    this.basefare = basefare;
  }
  public flights with_basefare(java.math.BigDecimal basefare) {
    this.basefare = basefare;
    return this;
  }
  private java.math.BigDecimal totalfare;
  public java.math.BigDecimal get_totalfare() {
    return totalfare;
  }
  public void set_totalfare(java.math.BigDecimal totalfare) {
    this.totalfare = totalfare;
  }
  public flights with_totalfare(java.math.BigDecimal totalfare) {
    this.totalfare = totalfare;
    return this;
  }
  private Integer seatsremaining;
  public Integer get_seatsremaining() {
    return seatsremaining;
  }
  public void set_seatsremaining(Integer seatsremaining) {
    this.seatsremaining = seatsremaining;
  }
  public flights with_seatsremaining(Integer seatsremaining) {
    this.seatsremaining = seatsremaining;
    return this;
  }
  private String totaltraveldistance;
  public String get_totaltraveldistance() {
    return totaltraveldistance;
  }
  public void set_totaltraveldistance(String totaltraveldistance) {
    this.totaltraveldistance = totaltraveldistance;
  }
  public flights with_totaltraveldistance(String totaltraveldistance) {
    this.totaltraveldistance = totaltraveldistance;
    return this;
  }
  private String segmentsdeparturetimeepochseconds;
  public String get_segmentsdeparturetimeepochseconds() {
    return segmentsdeparturetimeepochseconds;
  }
  public void set_segmentsdeparturetimeepochseconds(String segmentsdeparturetimeepochseconds) {
    this.segmentsdeparturetimeepochseconds = segmentsdeparturetimeepochseconds;
  }
  public flights with_segmentsdeparturetimeepochseconds(String segmentsdeparturetimeepochseconds) {
    this.segmentsdeparturetimeepochseconds = segmentsdeparturetimeepochseconds;
    return this;
  }
  private String segmentsdeparturetimeraw;
  public String get_segmentsdeparturetimeraw() {
    return segmentsdeparturetimeraw;
  }
  public void set_segmentsdeparturetimeraw(String segmentsdeparturetimeraw) {
    this.segmentsdeparturetimeraw = segmentsdeparturetimeraw;
  }
  public flights with_segmentsdeparturetimeraw(String segmentsdeparturetimeraw) {
    this.segmentsdeparturetimeraw = segmentsdeparturetimeraw;
    return this;
  }
  private String segmentsarrivaltimeepochseconds;
  public String get_segmentsarrivaltimeepochseconds() {
    return segmentsarrivaltimeepochseconds;
  }
  public void set_segmentsarrivaltimeepochseconds(String segmentsarrivaltimeepochseconds) {
    this.segmentsarrivaltimeepochseconds = segmentsarrivaltimeepochseconds;
  }
  public flights with_segmentsarrivaltimeepochseconds(String segmentsarrivaltimeepochseconds) {
    this.segmentsarrivaltimeepochseconds = segmentsarrivaltimeepochseconds;
    return this;
  }
  private String segmentsarrivaltimeraw;
  public String get_segmentsarrivaltimeraw() {
    return segmentsarrivaltimeraw;
  }
  public void set_segmentsarrivaltimeraw(String segmentsarrivaltimeraw) {
    this.segmentsarrivaltimeraw = segmentsarrivaltimeraw;
  }
  public flights with_segmentsarrivaltimeraw(String segmentsarrivaltimeraw) {
    this.segmentsarrivaltimeraw = segmentsarrivaltimeraw;
    return this;
  }
  private String segmentsarrivalairportcode;
  public String get_segmentsarrivalairportcode() {
    return segmentsarrivalairportcode;
  }
  public void set_segmentsarrivalairportcode(String segmentsarrivalairportcode) {
    this.segmentsarrivalairportcode = segmentsarrivalairportcode;
  }
  public flights with_segmentsarrivalairportcode(String segmentsarrivalairportcode) {
    this.segmentsarrivalairportcode = segmentsarrivalairportcode;
    return this;
  }
  private String segmentsdepartureairportcode;
  public String get_segmentsdepartureairportcode() {
    return segmentsdepartureairportcode;
  }
  public void set_segmentsdepartureairportcode(String segmentsdepartureairportcode) {
    this.segmentsdepartureairportcode = segmentsdepartureairportcode;
  }
  public flights with_segmentsdepartureairportcode(String segmentsdepartureairportcode) {
    this.segmentsdepartureairportcode = segmentsdepartureairportcode;
    return this;
  }
  private String segmentsairlinename;
  public String get_segmentsairlinename() {
    return segmentsairlinename;
  }
  public void set_segmentsairlinename(String segmentsairlinename) {
    this.segmentsairlinename = segmentsairlinename;
  }
  public flights with_segmentsairlinename(String segmentsairlinename) {
    this.segmentsairlinename = segmentsairlinename;
    return this;
  }
  private String segmentsairlinecode;
  public String get_segmentsairlinecode() {
    return segmentsairlinecode;
  }
  public void set_segmentsairlinecode(String segmentsairlinecode) {
    this.segmentsairlinecode = segmentsairlinecode;
  }
  public flights with_segmentsairlinecode(String segmentsairlinecode) {
    this.segmentsairlinecode = segmentsairlinecode;
    return this;
  }
  private String segmentsequipmentdescription;
  public String get_segmentsequipmentdescription() {
    return segmentsequipmentdescription;
  }
  public void set_segmentsequipmentdescription(String segmentsequipmentdescription) {
    this.segmentsequipmentdescription = segmentsequipmentdescription;
  }
  public flights with_segmentsequipmentdescription(String segmentsequipmentdescription) {
    this.segmentsequipmentdescription = segmentsequipmentdescription;
    return this;
  }
  private String segmentsdurationinseconds;
  public String get_segmentsdurationinseconds() {
    return segmentsdurationinseconds;
  }
  public void set_segmentsdurationinseconds(String segmentsdurationinseconds) {
    this.segmentsdurationinseconds = segmentsdurationinseconds;
  }
  public flights with_segmentsdurationinseconds(String segmentsdurationinseconds) {
    this.segmentsdurationinseconds = segmentsdurationinseconds;
    return this;
  }
  private String segmentsdistance;
  public String get_segmentsdistance() {
    return segmentsdistance;
  }
  public void set_segmentsdistance(String segmentsdistance) {
    this.segmentsdistance = segmentsdistance;
  }
  public flights with_segmentsdistance(String segmentsdistance) {
    this.segmentsdistance = segmentsdistance;
    return this;
  }
  private String segmentscabincode;
  public String get_segmentscabincode() {
    return segmentscabincode;
  }
  public void set_segmentscabincode(String segmentscabincode) {
    this.segmentscabincode = segmentscabincode;
  }
  public flights with_segmentscabincode(String segmentscabincode) {
    this.segmentscabincode = segmentscabincode;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof flights)) {
      return false;
    }
    flights that = (flights) o;
    boolean equal = true;
    equal = equal && (this.legid == null ? that.legid == null : this.legid.equals(that.legid));
    equal = equal && (this.searchdate == null ? that.searchdate == null : this.searchdate.equals(that.searchdate));
    equal = equal && (this.flightdate == null ? that.flightdate == null : this.flightdate.equals(that.flightdate));
    equal = equal && (this.startingairport == null ? that.startingairport == null : this.startingairport.equals(that.startingairport));
    equal = equal && (this.destinationairport == null ? that.destinationairport == null : this.destinationairport.equals(that.destinationairport));
    equal = equal && (this.farebasiscode == null ? that.farebasiscode == null : this.farebasiscode.equals(that.farebasiscode));
    equal = equal && (this.travelduration == null ? that.travelduration == null : this.travelduration.equals(that.travelduration));
    equal = equal && (this.elapseddays == null ? that.elapseddays == null : this.elapseddays.equals(that.elapseddays));
    equal = equal && (this.isbasiceconomy == null ? that.isbasiceconomy == null : this.isbasiceconomy.equals(that.isbasiceconomy));
    equal = equal && (this.isrefundable == null ? that.isrefundable == null : this.isrefundable.equals(that.isrefundable));
    equal = equal && (this.isnonstop == null ? that.isnonstop == null : this.isnonstop.equals(that.isnonstop));
    equal = equal && (this.basefare == null ? that.basefare == null : this.basefare.equals(that.basefare));
    equal = equal && (this.totalfare == null ? that.totalfare == null : this.totalfare.equals(that.totalfare));
    equal = equal && (this.seatsremaining == null ? that.seatsremaining == null : this.seatsremaining.equals(that.seatsremaining));
    equal = equal && (this.totaltraveldistance == null ? that.totaltraveldistance == null : this.totaltraveldistance.equals(that.totaltraveldistance));
    equal = equal && (this.segmentsdeparturetimeepochseconds == null ? that.segmentsdeparturetimeepochseconds == null : this.segmentsdeparturetimeepochseconds.equals(that.segmentsdeparturetimeepochseconds));
    equal = equal && (this.segmentsdeparturetimeraw == null ? that.segmentsdeparturetimeraw == null : this.segmentsdeparturetimeraw.equals(that.segmentsdeparturetimeraw));
    equal = equal && (this.segmentsarrivaltimeepochseconds == null ? that.segmentsarrivaltimeepochseconds == null : this.segmentsarrivaltimeepochseconds.equals(that.segmentsarrivaltimeepochseconds));
    equal = equal && (this.segmentsarrivaltimeraw == null ? that.segmentsarrivaltimeraw == null : this.segmentsarrivaltimeraw.equals(that.segmentsarrivaltimeraw));
    equal = equal && (this.segmentsarrivalairportcode == null ? that.segmentsarrivalairportcode == null : this.segmentsarrivalairportcode.equals(that.segmentsarrivalairportcode));
    equal = equal && (this.segmentsdepartureairportcode == null ? that.segmentsdepartureairportcode == null : this.segmentsdepartureairportcode.equals(that.segmentsdepartureairportcode));
    equal = equal && (this.segmentsairlinename == null ? that.segmentsairlinename == null : this.segmentsairlinename.equals(that.segmentsairlinename));
    equal = equal && (this.segmentsairlinecode == null ? that.segmentsairlinecode == null : this.segmentsairlinecode.equals(that.segmentsairlinecode));
    equal = equal && (this.segmentsequipmentdescription == null ? that.segmentsequipmentdescription == null : this.segmentsequipmentdescription.equals(that.segmentsequipmentdescription));
    equal = equal && (this.segmentsdurationinseconds == null ? that.segmentsdurationinseconds == null : this.segmentsdurationinseconds.equals(that.segmentsdurationinseconds));
    equal = equal && (this.segmentsdistance == null ? that.segmentsdistance == null : this.segmentsdistance.equals(that.segmentsdistance));
    equal = equal && (this.segmentscabincode == null ? that.segmentscabincode == null : this.segmentscabincode.equals(that.segmentscabincode));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof flights)) {
      return false;
    }
    flights that = (flights) o;
    boolean equal = true;
    equal = equal && (this.legid == null ? that.legid == null : this.legid.equals(that.legid));
    equal = equal && (this.searchdate == null ? that.searchdate == null : this.searchdate.equals(that.searchdate));
    equal = equal && (this.flightdate == null ? that.flightdate == null : this.flightdate.equals(that.flightdate));
    equal = equal && (this.startingairport == null ? that.startingairport == null : this.startingairport.equals(that.startingairport));
    equal = equal && (this.destinationairport == null ? that.destinationairport == null : this.destinationairport.equals(that.destinationairport));
    equal = equal && (this.farebasiscode == null ? that.farebasiscode == null : this.farebasiscode.equals(that.farebasiscode));
    equal = equal && (this.travelduration == null ? that.travelduration == null : this.travelduration.equals(that.travelduration));
    equal = equal && (this.elapseddays == null ? that.elapseddays == null : this.elapseddays.equals(that.elapseddays));
    equal = equal && (this.isbasiceconomy == null ? that.isbasiceconomy == null : this.isbasiceconomy.equals(that.isbasiceconomy));
    equal = equal && (this.isrefundable == null ? that.isrefundable == null : this.isrefundable.equals(that.isrefundable));
    equal = equal && (this.isnonstop == null ? that.isnonstop == null : this.isnonstop.equals(that.isnonstop));
    equal = equal && (this.basefare == null ? that.basefare == null : this.basefare.equals(that.basefare));
    equal = equal && (this.totalfare == null ? that.totalfare == null : this.totalfare.equals(that.totalfare));
    equal = equal && (this.seatsremaining == null ? that.seatsremaining == null : this.seatsremaining.equals(that.seatsremaining));
    equal = equal && (this.totaltraveldistance == null ? that.totaltraveldistance == null : this.totaltraveldistance.equals(that.totaltraveldistance));
    equal = equal && (this.segmentsdeparturetimeepochseconds == null ? that.segmentsdeparturetimeepochseconds == null : this.segmentsdeparturetimeepochseconds.equals(that.segmentsdeparturetimeepochseconds));
    equal = equal && (this.segmentsdeparturetimeraw == null ? that.segmentsdeparturetimeraw == null : this.segmentsdeparturetimeraw.equals(that.segmentsdeparturetimeraw));
    equal = equal && (this.segmentsarrivaltimeepochseconds == null ? that.segmentsarrivaltimeepochseconds == null : this.segmentsarrivaltimeepochseconds.equals(that.segmentsarrivaltimeepochseconds));
    equal = equal && (this.segmentsarrivaltimeraw == null ? that.segmentsarrivaltimeraw == null : this.segmentsarrivaltimeraw.equals(that.segmentsarrivaltimeraw));
    equal = equal && (this.segmentsarrivalairportcode == null ? that.segmentsarrivalairportcode == null : this.segmentsarrivalairportcode.equals(that.segmentsarrivalairportcode));
    equal = equal && (this.segmentsdepartureairportcode == null ? that.segmentsdepartureairportcode == null : this.segmentsdepartureairportcode.equals(that.segmentsdepartureairportcode));
    equal = equal && (this.segmentsairlinename == null ? that.segmentsairlinename == null : this.segmentsairlinename.equals(that.segmentsairlinename));
    equal = equal && (this.segmentsairlinecode == null ? that.segmentsairlinecode == null : this.segmentsairlinecode.equals(that.segmentsairlinecode));
    equal = equal && (this.segmentsequipmentdescription == null ? that.segmentsequipmentdescription == null : this.segmentsequipmentdescription.equals(that.segmentsequipmentdescription));
    equal = equal && (this.segmentsdurationinseconds == null ? that.segmentsdurationinseconds == null : this.segmentsdurationinseconds.equals(that.segmentsdurationinseconds));
    equal = equal && (this.segmentsdistance == null ? that.segmentsdistance == null : this.segmentsdistance.equals(that.segmentsdistance));
    equal = equal && (this.segmentscabincode == null ? that.segmentscabincode == null : this.segmentscabincode.equals(that.segmentscabincode));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.legid = JdbcWritableBridge.readString(1, __dbResults);
    this.searchdate = JdbcWritableBridge.readDate(2, __dbResults);
    this.flightdate = JdbcWritableBridge.readDate(3, __dbResults);
    this.startingairport = JdbcWritableBridge.readString(4, __dbResults);
    this.destinationairport = JdbcWritableBridge.readString(5, __dbResults);
    this.farebasiscode = JdbcWritableBridge.readString(6, __dbResults);
    this.travelduration = JdbcWritableBridge.readString(7, __dbResults);
    this.elapseddays = JdbcWritableBridge.readInteger(8, __dbResults);
    this.isbasiceconomy = JdbcWritableBridge.readBoolean(9, __dbResults);
    this.isrefundable = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.isnonstop = JdbcWritableBridge.readBoolean(11, __dbResults);
    this.basefare = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.totalfare = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.seatsremaining = JdbcWritableBridge.readInteger(14, __dbResults);
    this.totaltraveldistance = JdbcWritableBridge.readString(15, __dbResults);
    this.segmentsdeparturetimeepochseconds = JdbcWritableBridge.readString(16, __dbResults);
    this.segmentsdeparturetimeraw = JdbcWritableBridge.readString(17, __dbResults);
    this.segmentsarrivaltimeepochseconds = JdbcWritableBridge.readString(18, __dbResults);
    this.segmentsarrivaltimeraw = JdbcWritableBridge.readString(19, __dbResults);
    this.segmentsarrivalairportcode = JdbcWritableBridge.readString(20, __dbResults);
    this.segmentsdepartureairportcode = JdbcWritableBridge.readString(21, __dbResults);
    this.segmentsairlinename = JdbcWritableBridge.readString(22, __dbResults);
    this.segmentsairlinecode = JdbcWritableBridge.readString(23, __dbResults);
    this.segmentsequipmentdescription = JdbcWritableBridge.readString(24, __dbResults);
    this.segmentsdurationinseconds = JdbcWritableBridge.readString(25, __dbResults);
    this.segmentsdistance = JdbcWritableBridge.readString(26, __dbResults);
    this.segmentscabincode = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.legid = JdbcWritableBridge.readString(1, __dbResults);
    this.searchdate = JdbcWritableBridge.readDate(2, __dbResults);
    this.flightdate = JdbcWritableBridge.readDate(3, __dbResults);
    this.startingairport = JdbcWritableBridge.readString(4, __dbResults);
    this.destinationairport = JdbcWritableBridge.readString(5, __dbResults);
    this.farebasiscode = JdbcWritableBridge.readString(6, __dbResults);
    this.travelduration = JdbcWritableBridge.readString(7, __dbResults);
    this.elapseddays = JdbcWritableBridge.readInteger(8, __dbResults);
    this.isbasiceconomy = JdbcWritableBridge.readBoolean(9, __dbResults);
    this.isrefundable = JdbcWritableBridge.readBoolean(10, __dbResults);
    this.isnonstop = JdbcWritableBridge.readBoolean(11, __dbResults);
    this.basefare = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.totalfare = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.seatsremaining = JdbcWritableBridge.readInteger(14, __dbResults);
    this.totaltraveldistance = JdbcWritableBridge.readString(15, __dbResults);
    this.segmentsdeparturetimeepochseconds = JdbcWritableBridge.readString(16, __dbResults);
    this.segmentsdeparturetimeraw = JdbcWritableBridge.readString(17, __dbResults);
    this.segmentsarrivaltimeepochseconds = JdbcWritableBridge.readString(18, __dbResults);
    this.segmentsarrivaltimeraw = JdbcWritableBridge.readString(19, __dbResults);
    this.segmentsarrivalairportcode = JdbcWritableBridge.readString(20, __dbResults);
    this.segmentsdepartureairportcode = JdbcWritableBridge.readString(21, __dbResults);
    this.segmentsairlinename = JdbcWritableBridge.readString(22, __dbResults);
    this.segmentsairlinecode = JdbcWritableBridge.readString(23, __dbResults);
    this.segmentsequipmentdescription = JdbcWritableBridge.readString(24, __dbResults);
    this.segmentsdurationinseconds = JdbcWritableBridge.readString(25, __dbResults);
    this.segmentsdistance = JdbcWritableBridge.readString(26, __dbResults);
    this.segmentscabincode = JdbcWritableBridge.readString(27, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(legid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(searchdate, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(flightdate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(startingairport, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(destinationairport, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(farebasiscode, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travelduration, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(elapseddays, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(isbasiceconomy, 9 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(isrefundable, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(isnonstop, 11 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(basefare, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(totalfare, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeInteger(seatsremaining, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(totaltraveldistance, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdeparturetimeepochseconds, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdeparturetimeraw, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivaltimeepochseconds, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivaltimeraw, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivalairportcode, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdepartureairportcode, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsairlinename, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsairlinecode, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsequipmentdescription, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdurationinseconds, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdistance, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentscabincode, 27 + __off, 12, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(legid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(searchdate, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(flightdate, 3 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(startingairport, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(destinationairport, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(farebasiscode, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(travelduration, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(elapseddays, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(isbasiceconomy, 9 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(isrefundable, 10 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(isnonstop, 11 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(basefare, 12 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(totalfare, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeInteger(seatsremaining, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(totaltraveldistance, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdeparturetimeepochseconds, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdeparturetimeraw, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivaltimeepochseconds, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivaltimeraw, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsarrivalairportcode, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdepartureairportcode, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsairlinename, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsairlinecode, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsequipmentdescription, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdurationinseconds, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentsdistance, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(segmentscabincode, 27 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.legid = null;
    } else {
    this.legid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.searchdate = null;
    } else {
    this.searchdate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flightdate = null;
    } else {
    this.flightdate = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.startingairport = null;
    } else {
    this.startingairport = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.destinationairport = null;
    } else {
    this.destinationairport = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.farebasiscode = null;
    } else {
    this.farebasiscode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.travelduration = null;
    } else {
    this.travelduration = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.elapseddays = null;
    } else {
    this.elapseddays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.isbasiceconomy = null;
    } else {
    this.isbasiceconomy = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.isrefundable = null;
    } else {
    this.isrefundable = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.isnonstop = null;
    } else {
    this.isnonstop = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.basefare = null;
    } else {
    this.basefare = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.totalfare = null;
    } else {
    this.totalfare = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seatsremaining = null;
    } else {
    this.seatsremaining = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.totaltraveldistance = null;
    } else {
    this.totaltraveldistance = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsdeparturetimeepochseconds = null;
    } else {
    this.segmentsdeparturetimeepochseconds = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsdeparturetimeraw = null;
    } else {
    this.segmentsdeparturetimeraw = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsarrivaltimeepochseconds = null;
    } else {
    this.segmentsarrivaltimeepochseconds = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsarrivaltimeraw = null;
    } else {
    this.segmentsarrivaltimeraw = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsarrivalairportcode = null;
    } else {
    this.segmentsarrivalairportcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsdepartureairportcode = null;
    } else {
    this.segmentsdepartureairportcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsairlinename = null;
    } else {
    this.segmentsairlinename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsairlinecode = null;
    } else {
    this.segmentsairlinecode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsequipmentdescription = null;
    } else {
    this.segmentsequipmentdescription = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsdurationinseconds = null;
    } else {
    this.segmentsdurationinseconds = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentsdistance = null;
    } else {
    this.segmentsdistance = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.segmentscabincode = null;
    } else {
    this.segmentscabincode = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.legid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legid);
    }
    if (null == this.searchdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.searchdate.getTime());
    }
    if (null == this.flightdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.flightdate.getTime());
    }
    if (null == this.startingairport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, startingairport);
    }
    if (null == this.destinationairport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, destinationairport);
    }
    if (null == this.farebasiscode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, farebasiscode);
    }
    if (null == this.travelduration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travelduration);
    }
    if (null == this.elapseddays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.elapseddays);
    }
    if (null == this.isbasiceconomy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isbasiceconomy);
    }
    if (null == this.isrefundable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isrefundable);
    }
    if (null == this.isnonstop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isnonstop);
    }
    if (null == this.basefare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.basefare, __dataOut);
    }
    if (null == this.totalfare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.totalfare, __dataOut);
    }
    if (null == this.seatsremaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.seatsremaining);
    }
    if (null == this.totaltraveldistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, totaltraveldistance);
    }
    if (null == this.segmentsdeparturetimeepochseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdeparturetimeepochseconds);
    }
    if (null == this.segmentsdeparturetimeraw) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdeparturetimeraw);
    }
    if (null == this.segmentsarrivaltimeepochseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivaltimeepochseconds);
    }
    if (null == this.segmentsarrivaltimeraw) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivaltimeraw);
    }
    if (null == this.segmentsarrivalairportcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivalairportcode);
    }
    if (null == this.segmentsdepartureairportcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdepartureairportcode);
    }
    if (null == this.segmentsairlinename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsairlinename);
    }
    if (null == this.segmentsairlinecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsairlinecode);
    }
    if (null == this.segmentsequipmentdescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsequipmentdescription);
    }
    if (null == this.segmentsdurationinseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdurationinseconds);
    }
    if (null == this.segmentsdistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdistance);
    }
    if (null == this.segmentscabincode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentscabincode);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.legid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legid);
    }
    if (null == this.searchdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.searchdate.getTime());
    }
    if (null == this.flightdate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.flightdate.getTime());
    }
    if (null == this.startingairport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, startingairport);
    }
    if (null == this.destinationairport) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, destinationairport);
    }
    if (null == this.farebasiscode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, farebasiscode);
    }
    if (null == this.travelduration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, travelduration);
    }
    if (null == this.elapseddays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.elapseddays);
    }
    if (null == this.isbasiceconomy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isbasiceconomy);
    }
    if (null == this.isrefundable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isrefundable);
    }
    if (null == this.isnonstop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.isnonstop);
    }
    if (null == this.basefare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.basefare, __dataOut);
    }
    if (null == this.totalfare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.totalfare, __dataOut);
    }
    if (null == this.seatsremaining) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.seatsremaining);
    }
    if (null == this.totaltraveldistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, totaltraveldistance);
    }
    if (null == this.segmentsdeparturetimeepochseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdeparturetimeepochseconds);
    }
    if (null == this.segmentsdeparturetimeraw) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdeparturetimeraw);
    }
    if (null == this.segmentsarrivaltimeepochseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivaltimeepochseconds);
    }
    if (null == this.segmentsarrivaltimeraw) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivaltimeraw);
    }
    if (null == this.segmentsarrivalairportcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsarrivalairportcode);
    }
    if (null == this.segmentsdepartureairportcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdepartureairportcode);
    }
    if (null == this.segmentsairlinename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsairlinename);
    }
    if (null == this.segmentsairlinecode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsairlinecode);
    }
    if (null == this.segmentsequipmentdescription) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsequipmentdescription);
    }
    if (null == this.segmentsdurationinseconds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdurationinseconds);
    }
    if (null == this.segmentsdistance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentsdistance);
    }
    if (null == this.segmentscabincode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, segmentscabincode);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(legid==null?"null":legid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(searchdate==null?"null":"" + searchdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flightdate==null?"null":"" + flightdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(startingairport==null?"null":startingairport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(destinationairport==null?"null":destinationairport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(farebasiscode==null?"null":farebasiscode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(travelduration==null?"null":travelduration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elapseddays==null?"null":"" + elapseddays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isbasiceconomy==null?"null":"" + isbasiceconomy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isrefundable==null?"null":"" + isrefundable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isnonstop==null?"null":"" + isnonstop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basefare==null?"null":basefare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totalfare==null?"null":totalfare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(seatsremaining==null?"null":"" + seatsremaining, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totaltraveldistance==null?"null":totaltraveldistance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdeparturetimeepochseconds==null?"null":segmentsdeparturetimeepochseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdeparturetimeraw==null?"null":segmentsdeparturetimeraw, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivaltimeepochseconds==null?"null":segmentsarrivaltimeepochseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivaltimeraw==null?"null":segmentsarrivaltimeraw, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivalairportcode==null?"null":segmentsarrivalairportcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdepartureairportcode==null?"null":segmentsdepartureairportcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsairlinename==null?"null":segmentsairlinename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsairlinecode==null?"null":segmentsairlinecode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsequipmentdescription==null?"null":segmentsequipmentdescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdurationinseconds==null?"null":segmentsdurationinseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdistance==null?"null":segmentsdistance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentscabincode==null?"null":segmentscabincode, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(legid==null?"null":legid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(searchdate==null?"null":"" + searchdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flightdate==null?"null":"" + flightdate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(startingairport==null?"null":startingairport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(destinationairport==null?"null":destinationairport, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(farebasiscode==null?"null":farebasiscode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(travelduration==null?"null":travelduration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elapseddays==null?"null":"" + elapseddays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isbasiceconomy==null?"null":"" + isbasiceconomy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isrefundable==null?"null":"" + isrefundable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isnonstop==null?"null":"" + isnonstop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basefare==null?"null":basefare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totalfare==null?"null":totalfare.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(seatsremaining==null?"null":"" + seatsremaining, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totaltraveldistance==null?"null":totaltraveldistance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdeparturetimeepochseconds==null?"null":segmentsdeparturetimeepochseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdeparturetimeraw==null?"null":segmentsdeparturetimeraw, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivaltimeepochseconds==null?"null":segmentsarrivaltimeepochseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivaltimeraw==null?"null":segmentsarrivaltimeraw, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsarrivalairportcode==null?"null":segmentsarrivalairportcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdepartureairportcode==null?"null":segmentsdepartureairportcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsairlinename==null?"null":segmentsairlinename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsairlinecode==null?"null":segmentsairlinecode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsequipmentdescription==null?"null":segmentsequipmentdescription, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdurationinseconds==null?"null":segmentsdurationinseconds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentsdistance==null?"null":segmentsdistance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(segmentscabincode==null?"null":segmentscabincode, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legid = null; } else {
      this.legid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.searchdate = null; } else {
      this.searchdate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flightdate = null; } else {
      this.flightdate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.startingairport = null; } else {
      this.startingairport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.destinationairport = null; } else {
      this.destinationairport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.farebasiscode = null; } else {
      this.farebasiscode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.travelduration = null; } else {
      this.travelduration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elapseddays = null; } else {
      this.elapseddays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isbasiceconomy = null; } else {
      this.isbasiceconomy = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isrefundable = null; } else {
      this.isrefundable = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isnonstop = null; } else {
      this.isnonstop = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basefare = null; } else {
      this.basefare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.totalfare = null; } else {
      this.totalfare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.seatsremaining = null; } else {
      this.seatsremaining = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.totaltraveldistance = null; } else {
      this.totaltraveldistance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdeparturetimeepochseconds = null; } else {
      this.segmentsdeparturetimeepochseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdeparturetimeraw = null; } else {
      this.segmentsdeparturetimeraw = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivaltimeepochseconds = null; } else {
      this.segmentsarrivaltimeepochseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivaltimeraw = null; } else {
      this.segmentsarrivaltimeraw = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivalairportcode = null; } else {
      this.segmentsarrivalairportcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdepartureairportcode = null; } else {
      this.segmentsdepartureairportcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsairlinename = null; } else {
      this.segmentsairlinename = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsairlinecode = null; } else {
      this.segmentsairlinecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsequipmentdescription = null; } else {
      this.segmentsequipmentdescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdurationinseconds = null; } else {
      this.segmentsdurationinseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdistance = null; } else {
      this.segmentsdistance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentscabincode = null; } else {
      this.segmentscabincode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legid = null; } else {
      this.legid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.searchdate = null; } else {
      this.searchdate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flightdate = null; } else {
      this.flightdate = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.startingairport = null; } else {
      this.startingairport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.destinationairport = null; } else {
      this.destinationairport = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.farebasiscode = null; } else {
      this.farebasiscode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.travelduration = null; } else {
      this.travelduration = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elapseddays = null; } else {
      this.elapseddays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isbasiceconomy = null; } else {
      this.isbasiceconomy = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isrefundable = null; } else {
      this.isrefundable = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isnonstop = null; } else {
      this.isnonstop = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basefare = null; } else {
      this.basefare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.totalfare = null; } else {
      this.totalfare = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.seatsremaining = null; } else {
      this.seatsremaining = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.totaltraveldistance = null; } else {
      this.totaltraveldistance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdeparturetimeepochseconds = null; } else {
      this.segmentsdeparturetimeepochseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdeparturetimeraw = null; } else {
      this.segmentsdeparturetimeraw = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivaltimeepochseconds = null; } else {
      this.segmentsarrivaltimeepochseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivaltimeraw = null; } else {
      this.segmentsarrivaltimeraw = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsarrivalairportcode = null; } else {
      this.segmentsarrivalairportcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdepartureairportcode = null; } else {
      this.segmentsdepartureairportcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsairlinename = null; } else {
      this.segmentsairlinename = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsairlinecode = null; } else {
      this.segmentsairlinecode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsequipmentdescription = null; } else {
      this.segmentsequipmentdescription = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdurationinseconds = null; } else {
      this.segmentsdurationinseconds = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentsdistance = null; } else {
      this.segmentsdistance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.segmentscabincode = null; } else {
      this.segmentscabincode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    flights o = (flights) super.clone();
    o.searchdate = (o.searchdate != null) ? (java.sql.Date) o.searchdate.clone() : null;
    o.flightdate = (o.flightdate != null) ? (java.sql.Date) o.flightdate.clone() : null;
    return o;
  }

  public void clone0(flights o) throws CloneNotSupportedException {
    o.searchdate = (o.searchdate != null) ? (java.sql.Date) o.searchdate.clone() : null;
    o.flightdate = (o.flightdate != null) ? (java.sql.Date) o.flightdate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("legid", this.legid);
    __sqoop$field_map.put("searchdate", this.searchdate);
    __sqoop$field_map.put("flightdate", this.flightdate);
    __sqoop$field_map.put("startingairport", this.startingairport);
    __sqoop$field_map.put("destinationairport", this.destinationairport);
    __sqoop$field_map.put("farebasiscode", this.farebasiscode);
    __sqoop$field_map.put("travelduration", this.travelduration);
    __sqoop$field_map.put("elapseddays", this.elapseddays);
    __sqoop$field_map.put("isbasiceconomy", this.isbasiceconomy);
    __sqoop$field_map.put("isrefundable", this.isrefundable);
    __sqoop$field_map.put("isnonstop", this.isnonstop);
    __sqoop$field_map.put("basefare", this.basefare);
    __sqoop$field_map.put("totalfare", this.totalfare);
    __sqoop$field_map.put("seatsremaining", this.seatsremaining);
    __sqoop$field_map.put("totaltraveldistance", this.totaltraveldistance);
    __sqoop$field_map.put("segmentsdeparturetimeepochseconds", this.segmentsdeparturetimeepochseconds);
    __sqoop$field_map.put("segmentsdeparturetimeraw", this.segmentsdeparturetimeraw);
    __sqoop$field_map.put("segmentsarrivaltimeepochseconds", this.segmentsarrivaltimeepochseconds);
    __sqoop$field_map.put("segmentsarrivaltimeraw", this.segmentsarrivaltimeraw);
    __sqoop$field_map.put("segmentsarrivalairportcode", this.segmentsarrivalairportcode);
    __sqoop$field_map.put("segmentsdepartureairportcode", this.segmentsdepartureairportcode);
    __sqoop$field_map.put("segmentsairlinename", this.segmentsairlinename);
    __sqoop$field_map.put("segmentsairlinecode", this.segmentsairlinecode);
    __sqoop$field_map.put("segmentsequipmentdescription", this.segmentsequipmentdescription);
    __sqoop$field_map.put("segmentsdurationinseconds", this.segmentsdurationinseconds);
    __sqoop$field_map.put("segmentsdistance", this.segmentsdistance);
    __sqoop$field_map.put("segmentscabincode", this.segmentscabincode);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("legid", this.legid);
    __sqoop$field_map.put("searchdate", this.searchdate);
    __sqoop$field_map.put("flightdate", this.flightdate);
    __sqoop$field_map.put("startingairport", this.startingairport);
    __sqoop$field_map.put("destinationairport", this.destinationairport);
    __sqoop$field_map.put("farebasiscode", this.farebasiscode);
    __sqoop$field_map.put("travelduration", this.travelduration);
    __sqoop$field_map.put("elapseddays", this.elapseddays);
    __sqoop$field_map.put("isbasiceconomy", this.isbasiceconomy);
    __sqoop$field_map.put("isrefundable", this.isrefundable);
    __sqoop$field_map.put("isnonstop", this.isnonstop);
    __sqoop$field_map.put("basefare", this.basefare);
    __sqoop$field_map.put("totalfare", this.totalfare);
    __sqoop$field_map.put("seatsremaining", this.seatsremaining);
    __sqoop$field_map.put("totaltraveldistance", this.totaltraveldistance);
    __sqoop$field_map.put("segmentsdeparturetimeepochseconds", this.segmentsdeparturetimeepochseconds);
    __sqoop$field_map.put("segmentsdeparturetimeraw", this.segmentsdeparturetimeraw);
    __sqoop$field_map.put("segmentsarrivaltimeepochseconds", this.segmentsarrivaltimeepochseconds);
    __sqoop$field_map.put("segmentsarrivaltimeraw", this.segmentsarrivaltimeraw);
    __sqoop$field_map.put("segmentsarrivalairportcode", this.segmentsarrivalairportcode);
    __sqoop$field_map.put("segmentsdepartureairportcode", this.segmentsdepartureairportcode);
    __sqoop$field_map.put("segmentsairlinename", this.segmentsairlinename);
    __sqoop$field_map.put("segmentsairlinecode", this.segmentsairlinecode);
    __sqoop$field_map.put("segmentsequipmentdescription", this.segmentsequipmentdescription);
    __sqoop$field_map.put("segmentsdurationinseconds", this.segmentsdurationinseconds);
    __sqoop$field_map.put("segmentsdistance", this.segmentsdistance);
    __sqoop$field_map.put("segmentscabincode", this.segmentscabincode);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
