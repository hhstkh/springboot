package com.example.springboot.configuration;


/*@Configuration
@EnableJpaRepositories(basePackages = "com.example.springboot.repository",
entityManagerFactoryRef = "entityManagerFactory", 
transactionManagerRef = "transactionManager")
@EnableTransactionManagement*/
public class JpaConfiguration {
	/*@Autowired
	private Environment environment;
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "datasource.sampleapp")
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}
	
	
     * Configure HikariCP pooled DataSource.
     
    @Bean
    public DataSource dataSource() {
        DataSourceProperties dataSourceProperties = dataSourceProperties();
        DataSource dataSource = DataSourceBuilder
                .create(dataSourceProperties.getClassLoader())
                .driverClassName(dataSourceProperties.getDriverClassName())
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .build();
        dataSource.setMaximumPoolSize(maxPoolSize);
        return dataSource;
    }
    
    
     * Here you can specify any provider specific properties.
     
    private Properties jpaProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("datasource.sampleapp.hibernate.dialect"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("datasource.sampleapp.hibernate.hbm2ddl.method"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("datasource.sampleapp.hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("datasource.sampleapp.hibernate.format_sql"));
        if(StringUtils.isNotEmpty(environment.getRequiredProperty("datasource.sampleapp.defaultSchema"))){
            properties.put("hibernate.default_schema", environment.getRequiredProperty("datasource.sampleapp.defaultSchema"));
        }
        return properties;
    }
    
    
	 * Provider specific adapter.
	 
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		return hibernateJpaVendorAdapter;
	}
	
	
	 * Entity Manager Factory setup.
	 
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan(new String[] { "com.example.springboot.entity" });
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());
		return factoryBean;
	}
	
	@Bean
	@Autowired
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	}*/
}
