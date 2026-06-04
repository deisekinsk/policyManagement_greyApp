# Git Commands Used in This Setup

### Check Branches

```bash
git branch                      # Show local branches
git branch -r                   # Show remote branches
git branch -a                   # Show all branches
```

### Rename Branch

```bash
git branch -M main              # Rename current branch to main
```

### Check Repository Status

```bash
git status                      # Show working tree status
```

### View Commit History

```bash
git log --oneline --graph --decorate -5    # Show recent commits
git log origin/main --oneline -5           # Show remote commit history
```

### Remote Repository

```bash
git remote -v                   # Show remote URLs
```

### Pull Changes

```bash
git pull origin main                                # Pull from remote main
git pull origin main --allow-unrelated-histories    # Merge unrelated histories
```

### Push Changes

```bash
git push -u origin main         # First push and set upstream
git push origin main --force    # Force push local history
```

### Delete Branches

```bash
git branch -d master            # Delete local branch
git branch -D master            # Force delete local branch
git push origin --delete master # Delete remote branch
```

### Clean Up

```bash
git fetch --prune               # Remove stale remote references
```