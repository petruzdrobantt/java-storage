### 1. `none` *(or empty)*
- Hibernate does **nothing** to the database.
- No create, no update, no validation.
- Safe for **production**.

---

### 2. `create`
- Drops **all** existing tables (if they already exist).
- Creates schema **from scratch** every startup.
- **All data is lost** on each restart.
- Good for tests or early development.

---

### 3. `create-drop`
- Same as `create`, **plus**:
    - Drops the schema **when the application stops**.
- Also wipes data every run.
- Good for integration tests.

---

### 4. `update`
- Compares entity classes with the existing schema.
- Applies **non-destructive changes**:
    - Adds new tables/columns
    - Alters columns (sometimes)
- **Does NOT remove** columns or tables.
- Keeps existing data.
- Convenient for development but unsafe for complex schema changes.

---

### 5. `validate`
- Does **not** change the schema.
- Only checks if the database matches your entities.
- If something is wrong → **startup error**.
- Good for production when schema is managed manually.

---

### 6. `none` or `off` (Spring Boot 3 behavior)
- Equivalent to “disable Hibernate DDL management”.
- Safe default for production.

---