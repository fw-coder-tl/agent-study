# 🤖 Dodo-Agent — 企业级通用智能体平台  
> 🔗 [在线体验地址](http://114.67.94.182:8888/) | 🐙 [GitHub 仓库](https://github.com/fw-coder-tl/dodo-agent)  

[![Live Demo](https://img.shields.io/badge/%F0%9F%9A%80-Live_Demo-blue?logo=google-chrome)](http://114.67.94.182:8888/)  
[![Spring AI](https://img.shields.io/badge/Spring_AI-1.0.0-brightgreen)](https://spring.io/projects/spring-ai)  
[![PGVector](https://img.shields.io/badge/PGVector-0.7.0-purple)](https://github.com/pgvector/pgvector)  

---

## 🌈 快速预览（10秒看懂它能做什么）
![Dodo-Agent 功能演示 GIF](./docs/demo.gif)  
> ✅ 支持：RAG文档问答｜联网搜索｜PPT智能生成｜深度自主研究（Plan-Execute-Critique）

---

## 🧱 核心架构（一图读懂设计思想）
![Dodo-Agent 系统架构图](./docs/architecture.png)  
*分层说明：*  
- **接入层**：Vue3 + SSE 流式响应前端  
- **AI编排层**：基于 Spring AI 的 `ChatClient` + `ToolCallback` + MCP 协议热插拔  
- **Agent核心**：ReAct / Plan-Execute / 状态机 三模态统一基类（模板方法模式）  
- **RAG引擎**：查询重写 → 多路扩展 → PgVector语义检索 + 元数据过滤  
- **数据基建**：MinIO存原始文件｜PostgreSQL+PGVector存向量｜Redis缓存对话记忆  

---

## 🚀 四大智能体能力对比
| Agent类型 | 输入示例 | 关键技术 | 输出效果 |
|-----------|----------|-----------|------------|
| 🔍 联网搜索问答 | “最近OpenAI发布了什么新模型？” | ReAct + SerpAPI工具调用 | 实时结果 + 引用来源 |
| 📄 文件RAG问答 | 上传PDF → “第3章讲了什么？” | 流式解析 + 带重叠滑动窗口分块 + PgVector混合检索 | 准确定位原文段落 |
| 📊 PPT智能生成 | “生成《AI Agent技术演进》汇报PPT” | 状态机7阶段 + Reactor异步流式输出 | 下载PPTX，含图表占位符 |
| 🧠 深度研究引擎 | “分析中国大模型备案政策对创业公司的影响” | Plan-Execute-Critique循环 + 上下文智能压缩 | 多轮迭代生成结构化报告 |

---

## 📦 快速启动（本地跑起来）
```bash
git clone https://github.com/fw-coder-tl/dodo-agent.git  
cd dodo-agent  
# 修改 application.yml 中的 Qwen API Key & PostgreSQL 连接信息  
./mvnw spring-boot:run 
