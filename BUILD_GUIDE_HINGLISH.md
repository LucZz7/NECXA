# NECXA — Phone se APK banane ka Guide (bina PC ke)

## Ye kya hai?
NECXA tumhara apna personal AI voice assistant app hai — Tech GPTx ke JARVIS
project par based hai (license ke hisaab se unka credit code me safe rakha gaya hai).
Tumhari branding: **NECXA naam, red/black premium theme, glowing red "N" icon.**

## Features (ye sab kaam karega)
- **Gemini Live voice** — real-time bolna-sunna (~700ms), Hindi/Hinglish समेत kai languages
- **Offline voice** — Vosk se bina internet ke sunna + speaker pehchan
- **Screen Vision** — screen padh ke samajhna (accessibility service)
- **WhatsApp / YouTube automation** — hands-free commands
- **Memory** — tumhe yaad rakhta hai (Room database)
- **17 floating overlays + 3D orb HUD** — screen pe tairta avatar
- **Themes** — default dark red/black

## APK kaise banayein (sirf phone se, 4 steps)

### Step 1 — GitHub repo banao
1. github.com kholo → **New repository** → naam `NECXA` → Public → Create.

### Step 2 — Code upload karo
Ye project folder (`NECXA/`) repo me push karna hai. Sabse aasan tareeka —
apne assistant ko GitHub ka **Personal Access Token** do (secure tareeke se),
wo khud repo me code push kar dega.

### Step 3 — Actions se APK build karo
1. Repo kholo → **Actions** tab → **Build NECXA APK** → **Run workflow**.
2. 10–20 min me build complete hoga → **Artifacts** me `NECXA-v1.0.0-debug`
   milega → download karo.

### Step 4 — Install + Setup
1. APK install karo (Unknown sources allow karna padega — ye tumhara khud ka app hai).
2. App kholo → **Settings** → apni **Gemini API key** paste karo
   (aistudio.google.com se free me milti hai).
3. Permissions ek-ek karke grant karo (mic, notifications, accessibility...).
4. Bas! "NECXA" bolo aur baat shuru.

## Zaroori note (license)
Ye code Tech GPTx ke Attribution License par hai. Iska matlab:
- Code me unka credit **hatana mana hai** (humne rakha hai — Settings/About me dikhega).
- Agar tum **YouTube video/Shorts me is app ko dikhate ho**, to video me unko
  credit dena hoga (bolke + description me link + screen pe naam) — ye unki shart hai.
- Sirf apne liye use karne me koi dikkat nahi.

## API key safety
Key sirf tumhare phone ke andar rahegi — kisi ko mat bhejo, APK share mat karo.
