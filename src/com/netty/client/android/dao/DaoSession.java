package com.netty.client.android.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.netty.client.android.dao.Device;

import com.netty.client.android.dao.DeviceDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig deviceDaoConfig;

    private final DeviceDao deviceDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        deviceDaoConfig = daoConfigMap.get(DeviceDao.class).clone();
        deviceDaoConfig.initIdentityScope(type);

        deviceDao = new DeviceDao(deviceDaoConfig, this);

        registerDao(Device.class, deviceDao);
    }
    
    public void clear() {
        deviceDaoConfig.getIdentityScope().clear();
    }

    public DeviceDao getDeviceDao() {
        return deviceDao;
    }

}