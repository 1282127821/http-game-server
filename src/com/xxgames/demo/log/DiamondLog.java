package com.xxgames.demo.log;

import com.xxgames.util.TimeUtil;

public class DiamondLog extends Log {

    public DiamondLog(final long pid, final int num, final String source) {
        super(pid, -1, num, TimeUtil.nowInt(), source);
        tableName = "t_log_diamond";
    }

}