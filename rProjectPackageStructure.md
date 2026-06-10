# Project Structure

```text

├── P controller
│   └── C PolicyController
│
├── P service
│   └── C PolicyService
│
├── P repository
│   └── I PolicyRepository
│
├── P entity
│   ├── C Policy
│   └── C Customer
│
├── P dto
│   ├── C PolicyRequestDTO
│   └── C PolicyResponseDTO
│
├── P exception
│   └── C BusinessException
│
├── P patterns
│   │
│   ├── P strategy
│   │   ├── I PremiumCalculationStrategy
│   │   └── C AutoInsuranceStrategy
│   │
│   ├── P factory
│   │   └── C InsuranceFactory
│   │
│   ├── P builder
│   │   └── C CustomerBuilder
│   │
│   ├── P observer
│   │   ├── I Observer
│   │   └── C EmailObserver
│   │
│   ├── P adapter
│   │   ├── I AddressService
│   │   └── C ViaCepAdapter
│   │
│   ├── P facade
│   │   └── C PolicyIssuanceFacade
│   │
│   └── P chain
│       ├── I Validator
│       └── C CPFValidator
│
├── P refactoring
│   ├── C LegacyPolicyProcessor
│   └── C RefactoredPolicyProcessor
│
└── P test
    └── C PolicyServiceTest
```

## Design Patterns Demonstrated

```text
Creational
├── Factory
└── Builder

Structural
└── Adapter

Behavioral
├── Strategy
├── Observer
└── Chain of Responsibility

Architectural
└── Facade
```