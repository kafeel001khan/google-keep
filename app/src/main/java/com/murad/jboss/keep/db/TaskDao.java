package com.murad.jboss.keep.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.murad.jboss.keep.models.Task;

/**
 * Created by murad on 05/01/18.
 */

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task")
    public Task[] getAllTasks();

    @Update
    public void updateUsers(Task... tasks);

    @Delete
    public void deleteUsers(Task... tasks);
}
