#!/bin/bash

# Exit immediately if any command fails
set -e

# Check if commit message was provided
if [ -z "$1" ]; then
  echo "❌ Error: Commit message required."
  echo "Usage: ./git_push.sh \"Your commit message\""
  exit 1
fi

# Optionally specify a branch (default: current branch)
BRANCH=$(git symbolic-ref --short HEAD)

echo "🔍 Current branch: $BRANCH"

# Add all changes
git add .

echo "✅ All changes staged."

# Commit
git commit -m "$1"

echo "✅ Commit created: \"$1\""

# Push to remote
git push origin "$BRANCH"

echo "🚀 Changes pushed to origin/$BRANCH"
