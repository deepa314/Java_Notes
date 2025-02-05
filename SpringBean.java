Bean Life Cycle


Instance Created -----> Dependencies Injected ---> BeanNameAware----> Other Aware ---> ApplicationContext
BeanPostProcessor------>PostConstruct        ---->InitializingBean----->init------->BeanPostProcessor----------->
Bean is Ready

                ┌──────────────────────────┐
        ┌──────►|    Bean Instantiation    │
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       |   setBeanName() (BeanNameAware) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       |   setBeanFactory() (BeanFactoryAware) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       |  setApplicationContext() (ApplicationContextAware) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | Dependency Injection (DI) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | BeanPostProcessor (Before Init) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | Bean Initialization (@PostConstruct) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | BeanPostProcessor (After Init) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | Bean Ready to Use ✅ |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        │       | PreDestroy (@PreDestroy) |
        │       └──────────────────────────┘
        │                │
        │                ▼
        │       ┌──────────────────────────┐
        └──────►|   Bean Destruction 💥    │
                └──────────────────────────┘




