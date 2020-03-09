package mx.kairos.santander.connectdocker.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Profile {
    
    @Id
    public ObjectId _id;
    public String name;
    public String last;
    
    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}