package cn.finalabproject.smartdesklamp.smartdesklamp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostureScoreStatistics {
    private int id;
    private int uid;
    private double score;
    private Date time;
}
