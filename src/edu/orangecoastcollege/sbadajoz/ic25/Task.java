package edu.orangecoastcollege.sbadajoz.ic25;

import java.io.Serializable;

/*
Badajoz, Seve
CS A170
December 2, 2016

IC25
*/
public class Task implements Serializable{
	private String mDeadline, mDueDate, mName;
	private int mPriority;
	
	public Task(String name, String dueDate, String deadline, int priority) {
		mName = name;
		mDueDate = dueDate;
		mDeadline = deadline;
		mPriority = priority;
	}
	
	public Task(Task other) {
		mName = other.mName;
		mDueDate = other.mDueDate;
		mDeadline = other.mDeadline;
		mPriority = other.mPriority;
	}

	public String getDeadline() {
		return mDeadline;
	}

	public String getDueDate() {
		return mDueDate;
	}

	public String getName() {
		return mName;
	}

	public int getPriority() {
		return mPriority;
	}

	public void setDeadline(String deadline) {
		this.mDeadline = deadline;
	}

	public void setDueDate(String dueDate) {
		this.mDueDate = dueDate;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public void setPriority(int priority) {
		this.mPriority = priority;
	}

	@Override
	public String toString() {
		return "Task [name=" + mName + ", dueDate=" + mDueDate + ", mDeadline=" + mDeadline + 
				 ", mPriority=" + mPriority + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mDeadline == null) ? 0 : mDeadline.hashCode());
		result = prime * result
				+ ((mDueDate == null) ? 0 : mDueDate.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + mPriority;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (mDeadline == null) {
			if (other.mDeadline != null)
				return false;
		} else if (!mDeadline.equals(other.mDeadline))
			return false;
		if (mDueDate == null) {
			if (other.mDueDate != null)
				return false;
		} else if (!mDueDate.equals(other.mDueDate))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mPriority != other.mPriority)
			return false;
		return true;
	}
	
	
	
}
