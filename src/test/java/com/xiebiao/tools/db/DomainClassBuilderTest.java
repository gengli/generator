package com.xiebiao.tools.db;

import java.util.HashSet;
import java.util.Set;

public class DomainClassBuilderTest extends BaseTestCase {
    private DomainClassBuilder modelClassBuilder;
    private Config config;

    protected void setUp() throws Exception {
	// super.setUp();
	config = new Config();
	modelClassBuilder = new DomainClassBuilder(config);
    }

    public void testBuild() throws Exception {
	Column name = new Column();
	name.setName("name");
	name.setDataType("varchar");

	Column year = new Column();
	year.setName("date");
	year.setDataType("year");

	Column datetime = new Column();
	datetime.setName("date");
	datetime.setDataType("datetime");

	Column _float = new Column();
	_float.setName("float");
	_float.setDataType("float");
	_float.setComment("字段说明");

	Set<Column> columns = new HashSet<Column>();
	columns.add(name);
	columns.add(year);
	columns.add(datetime);
	columns.add(_float);
	Table table = new Table();
	table.setName("Person");
	table.setColumns(columns);
	table.setComment("这是表说明");
	//modelClassBuilder.from(table).build();
    }
}