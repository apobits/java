package practice.java.practice;

import java.util.Objects;

public class Task {
    private String callID;
    private String status;

    public Task(String callID, String status) {
	this.callID = callID;
	this.status = status;
    }

    public String getCallID() {
	return callID;
    }

    public void setCallID(String callID) {
	this.callID = callID;
    }

    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
	this.status = status;
    }

    @Override
    public boolean equals(Object o) {
	if (this == o)
	    return true;
	if (o == null || getClass() != o.getClass())
	    return false;
	Task task = (Task) o;
	return callID.equals(task.callID);
    }

    @Override
    public int hashCode() {
	return Objects.hash(callID);
    }

    @Override
    public String toString() {
	return "Task{" + "callID='" + callID + '\'' + ", status='" + status + '\'' + '}';
    }
}
