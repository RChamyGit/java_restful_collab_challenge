import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
  ],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url))
    }
  },
  server: {
    proxy: {
      "/phrase": {
        target: 'http://10.0.0.179:8080',
        changeOrigin: true,
        secure: false,
        ws: false,
        rewrite:(path => {console.group(path); return path.replace(/ˆ\/phrase/, '')})
      }
    }
  }
})
