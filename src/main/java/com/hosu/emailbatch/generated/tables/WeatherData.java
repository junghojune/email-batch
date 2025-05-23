/*
 * This file is generated by jOOQ.
 */
package com.hosu.emailbatch.generated.tables;


import com.hosu.emailbatch.generated.Emailbatch;
import com.hosu.emailbatch.generated.Keys;
import com.hosu.emailbatch.generated.tables.records.WeatherDataRecord;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class WeatherData extends TableImpl<WeatherDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>emailbatch.WEATHER_DATA</code>
     */
    public static final WeatherData WEATHER_DATA = new WeatherData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WeatherDataRecord> getRecordType() {
        return WeatherDataRecord.class;
    }

    /**
     * The column <code>emailbatch.WEATHER_DATA.id</code>.
     */
    public final TableField<WeatherDataRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.location</code>.
     */
    public final TableField<WeatherDataRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.date</code>.
     */
    public final TableField<WeatherDataRecord, LocalDate> DATE = createField(DSL.name("date"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.temperature</code>.
     */
    public final TableField<WeatherDataRecord, Double> TEMPERATURE = createField(DSL.name("temperature"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.feels_like</code>.
     */
    public final TableField<WeatherDataRecord, Double> FEELS_LIKE = createField(DSL.name("feels_like"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.humidity</code>.
     */
    public final TableField<WeatherDataRecord, Integer> HUMIDITY = createField(DSL.name("humidity"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.wind_speed</code>.
     */
    public final TableField<WeatherDataRecord, Double> WIND_SPEED = createField(DSL.name("wind_speed"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.wind_direction</code>.
     */
    public final TableField<WeatherDataRecord, Integer> WIND_DIRECTION = createField(DSL.name("wind_direction"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.pressure</code>.
     */
    public final TableField<WeatherDataRecord, Double> PRESSURE = createField(DSL.name("pressure"), SQLDataType.FLOAT, this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.weather_main</code>.
     */
    public final TableField<WeatherDataRecord, String> WEATHER_MAIN = createField(DSL.name("weather_main"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.weather_description</code>.
     */
    public final TableField<WeatherDataRecord, String> WEATHER_DESCRIPTION = createField(DSL.name("weather_description"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.icon</code>.
     */
    public final TableField<WeatherDataRecord, String> ICON = createField(DSL.name("icon"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.created_at</code>.
     */
    public final TableField<WeatherDataRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>emailbatch.WEATHER_DATA.updated_at</code>.
     */
    public final TableField<WeatherDataRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private WeatherData(Name alias, Table<WeatherDataRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private WeatherData(Name alias, Table<WeatherDataRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>emailbatch.WEATHER_DATA</code> table reference
     */
    public WeatherData(String alias) {
        this(DSL.name(alias), WEATHER_DATA);
    }

    /**
     * Create an aliased <code>emailbatch.WEATHER_DATA</code> table reference
     */
    public WeatherData(Name alias) {
        this(alias, WEATHER_DATA);
    }

    /**
     * Create a <code>emailbatch.WEATHER_DATA</code> table reference
     */
    public WeatherData() {
        this(DSL.name("WEATHER_DATA"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Emailbatch.EMAILBATCH;
    }

    @Override
    public Identity<WeatherDataRecord, Long> getIdentity() {
        return (Identity<WeatherDataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<WeatherDataRecord> getPrimaryKey() {
        return Keys.KEY_WEATHER_DATA_PRIMARY;
    }

    @Override
    public List<UniqueKey<WeatherDataRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_WEATHER_DATA_LOCATION);
    }

    @Override
    public WeatherData as(String alias) {
        return new WeatherData(DSL.name(alias), this);
    }

    @Override
    public WeatherData as(Name alias) {
        return new WeatherData(alias, this);
    }

    @Override
    public WeatherData as(Table<?> alias) {
        return new WeatherData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherData rename(String name) {
        return new WeatherData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherData rename(Name name) {
        return new WeatherData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public WeatherData rename(Table<?> name) {
        return new WeatherData(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData where(Condition condition) {
        return new WeatherData(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public WeatherData where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public WeatherData where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public WeatherData where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public WeatherData where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public WeatherData whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
