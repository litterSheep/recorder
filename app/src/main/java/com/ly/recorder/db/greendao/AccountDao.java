package com.ly.recorder.db.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.ly.recorder.db.Account;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ACCOUNT".
*/
public class AccountDao extends AbstractDao<Account, Long> {

    public static final String TABLENAME = "ACCOUNT";

    /**
     * Properties of entity Account.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Year = new Property(1, Integer.class, "year", false, "YEAR");
        public final static Property Month = new Property(2, Integer.class, "month", false, "MONTH");
        public final static Property Date = new Property(3, Integer.class, "date", false, "DATE");
        public final static Property Breakfast = new Property(4, Float.class, "breakfast", false, "BREAKFAST");
        public final static Property Lunch = new Property(5, Float.class, "lunch", false, "LUNCH");
        public final static Property Dinner = new Property(6, Float.class, "dinner", false, "DINNER");
        public final static Property Other = new Property(7, Float.class, "other", false, "OTHER");
        public final static Property Total = new Property(8, Float.class, "total", false, "TOTAL");
        public final static Property Remark = new Property(9, String.class, "remark", false, "REMARK");
        public final static Property Time = new Property(10, Long.class, "time", false, "TIME");
    }


    public AccountDao(DaoConfig config) {
        super(config);
    }
    
    public AccountDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ACCOUNT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"YEAR\" INTEGER," + // 1: year
                "\"MONTH\" INTEGER," + // 2: month
                "\"DATE\" INTEGER," + // 3: date
                "\"BREAKFAST\" REAL," + // 4: breakfast
                "\"LUNCH\" REAL," + // 5: lunch
                "\"DINNER\" REAL," + // 6: dinner
                "\"OTHER\" REAL," + // 7: other
                "\"TOTAL\" REAL NOT NULL ," + // 8: total
                "\"REMARK\" TEXT," + // 9: remark
                "\"TIME\" INTEGER);"); // 10: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ACCOUNT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Account entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer year = entity.getYear();
        if (year != null) {
            stmt.bindLong(2, year);
        }

        Integer month = entity.getMonth();
        if (month != null) {
            stmt.bindLong(3, month);
        }

        Integer date = entity.getDate();
        if (date != null) {
            stmt.bindLong(4, date);
        }

        Float breakfast = entity.getBreakfast();
        if (breakfast != null) {
            stmt.bindDouble(5, breakfast);
        }

        Float lunch = entity.getLunch();
        if (lunch != null) {
            stmt.bindDouble(6, lunch);
        }

        Float dinner = entity.getDinner();
        if (dinner != null) {
            stmt.bindDouble(7, dinner);
        }

        Float other = entity.getOther();
        if (other != null) {
            stmt.bindDouble(8, other);
        }
        stmt.bindDouble(9, entity.getTotal());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(10, remark);
        }

        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(11, time);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Account entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer year = entity.getYear();
        if (year != null) {
            stmt.bindLong(2, year);
        }

        Integer month = entity.getMonth();
        if (month != null) {
            stmt.bindLong(3, month);
        }

        Integer date = entity.getDate();
        if (date != null) {
            stmt.bindLong(4, date);
        }

        Float breakfast = entity.getBreakfast();
        if (breakfast != null) {
            stmt.bindDouble(5, breakfast);
        }

        Float lunch = entity.getLunch();
        if (lunch != null) {
            stmt.bindDouble(6, lunch);
        }

        Float dinner = entity.getDinner();
        if (dinner != null) {
            stmt.bindDouble(7, dinner);
        }

        Float other = entity.getOther();
        if (other != null) {
            stmt.bindDouble(8, other);
        }
        stmt.bindDouble(9, entity.getTotal());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(10, remark);
        }

        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(11, time);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Account readEntity(Cursor cursor, int offset) {
        Account entity = new Account( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // year
                cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // month
                cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // date
                cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4), // breakfast
                cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // lunch
                cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // dinner
                cursor.isNull(offset + 7) ? null : cursor.getFloat(offset + 7), // other
                cursor.getFloat(offset + 8), // total
                cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // remark
                cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Account entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setYear(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setMonth(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setDate(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setBreakfast(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
        entity.setLunch(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setDinner(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setOther(cursor.isNull(offset + 7) ? null : cursor.getFloat(offset + 7));
        entity.setTotal(cursor.getFloat(offset + 8));
        entity.setRemark(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTime(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Account entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Account entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Account entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
