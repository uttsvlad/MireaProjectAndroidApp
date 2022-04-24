package ru.mirea.utts.mireaproject.fragments.stories;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StoryDAO {

    @Query("SELECT * FROM  story")
    List<Story> getAll();

    @Query("SELECT * FROM story WHERE id = :id")
    Story getById(long id);

    @Insert
    void insert(Story history);

    @Update
    void update(Story history);

    @Delete
    void delete(Story history);
}