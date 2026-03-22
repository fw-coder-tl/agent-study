package com.tianliang.agent.agent.hitl;

public sealed interface AgentResult permits AgentFinished, AgentInterrupted {
}