# Aurora-RE
AI-assisted local Reverse Engineering Companion — Deno + MLC-LLM

> Local-first, privacy-preserving scaffold. Intended for legal research, education
> and security auditing. This repository _does not_ enable illegal activity and
> ships with a compliance policy (see `docs/LEGAL.md`).

## Goal
Build a local LLM-powered assistant that integrates with Ghidra and VSCode to
help reverse engineering workflows: function explanation, pseudo-code cleanup,
transpilation helpers, and code reconstruction assistants.

## Quick start (developer)
1. Install Deno (v1.40+ recommended).
2. Install an `mlc-llm` local inference server (or other local LLM) and run it
   locally. The engine expects an HTTP endpoint at `http://127.0.0.1:8080` by
   default. See `core-llm/engine.ts` for config.
3. In this Codespace, run:

   ```bash
   deno task setup
   deno task start
   Open the vscode-extension/ folder in your local VSCode (or Codespace) and
run the extension host for development.```

Features

Local LLM wrapper (core-llm/engine.ts) for inference requests

VSCode extension that talks to the engine to ask for function explanations

Ghidra helper bridge (simple HTTP/WebSocket) to export functions/pseudocode

Policy enforcement to avoid illegal requests

Important

This scaffold is educational. Do not use it to circumvent license or DRM
protections. Read docs/LEGAL.md.