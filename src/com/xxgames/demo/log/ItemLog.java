package com.xxgames.demo.log;

import com.xxgames.util.TimeUtil;

public final class ItemLog extends Log {

    public ItemLog(final long pid, final int itemid, final int num, final String source) {
        super(pid, itemid, num, TimeUtil.nowInt(), source);
        tableName = "t_log_item";
    }

}
